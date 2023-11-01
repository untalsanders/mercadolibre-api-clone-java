package com.sandersgutierrez.supermarket.persistence;

import com.sandersgutierrez.supermarket.domain.Purchase;
import com.sandersgutierrez.supermarket.domain.repository.PurchaseRepository;
import com.sandersgutierrez.supermarket.persistence.crud.CompraCrudRepository;
import com.sandersgutierrez.supermarket.persistence.entity.Compra;
import com.sandersgutierrez.supermarket.persistence.mapper.PurchaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PurchaseRepository {

    private final CompraCrudRepository compraCrudRepository;

    private final PurchaseMapper mapper;

    @Autowired
    public CompraRepository(CompraCrudRepository compraCrudRepository, PurchaseMapper mapper) {
        this.compraCrudRepository = compraCrudRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Purchase> getAll() {
        return mapper.toPurchases((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Purchase>> getByClient(int clientId) {
        return compraCrudRepository.findByClienteId(clientId)
                .map(mapper::toPurchases);
    }

    @Override
    public Purchase save(Purchase purchase) {
        Compra compra = mapper.toCompra(purchase);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));

        return mapper.toPurchase(compraCrudRepository.save(compra));
    }
}
