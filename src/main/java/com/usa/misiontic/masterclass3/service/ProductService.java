package com.usa.misiontic.masterclass3.service;

import com.usa.misiontic.masterclass3.entities.Product;
import com.usa.misiontic.masterclass3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.attribute.standard.PDLOverrideSupported;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }
    public Optional<Product> getProduct(int id){
        return productRepository.getProduct(id);
    }
    public Product save(Product p){
        if(p.getId()==null){
            return productRepository.save(p);
        }else{
            Optional<Product> e =productRepository.getProduct(p.getId());
            if(e.isPresent()){
                return p;
            }else{
                return productRepository.save(p);
            }
        }
    }
    public Product update(Product p){
        if(p.getId()!=null){
            Optional<Product> q =productRepository.getProduct(p.getId());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                if(p.getYear()!=null){
                    q.get().setYear(p.getYear());
                }
                if(p.getCategory()!=null){
                    q.get().setCategory(p.getCategory());
                }
                productRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
        Optional<Product>p=productRepository.getProduct(id);
        if(p.isPresent()){
            productRepository.delete(p.get());
            flag=true;
        }
        return flag;

    }


}
