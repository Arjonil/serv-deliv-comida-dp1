package pe.edu.upao.servdelivcomidadp1.services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import pe.edu.upao.servdelivcomidadp1.models.Order;

@Service
public class OrderService {
    private List<Order> Orden;

    public OrderService() {
        this.Orden = new ArrayList<>();
    }

    public List<Order> getAllOrders(){
        return this.Orden;
    }

    public Optional<Order> getOrderById(String Id){
        return this.Orden.stream().filter(Orden -> Orden.getId().equals(Id)).findFirst();
    }

    public List<Order> getOrderByCustName(String custName){
        return this.Orden.stream().filter(Orden -> Orden.getCustomerName().equalsIgnoreCase(custName)).collect(Collectors.toList());
    }

    public void addOrder(Order orden){
        this.Orden.add(orden);
    }

    public boolean removeOrderById(String Id){
        return this.Orden.removeIf(Orden -> Orden.getId().equals(Id));
    }

    public void service(Order servicio){
        servicio.setCreationTime(LocalDateTime.now());
    }

}

