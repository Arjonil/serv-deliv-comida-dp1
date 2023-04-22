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
    private List<Order> orderList;

    public OrderService() {
        this.orderList = new ArrayList<>();
    }

    public List<Order> getAllOrders(){
        return this.orderList;
    }

    public Optional<Order> getOrderById(String id){
        return this.orderList.stream().filter(orden -> orden.getId().equals(id)).findFirst();
    }

    public List<Order> getOrderByCustName(String custName){
        return this.orderList.stream().filter(Orden -> Orden.getCustomerName().equalsIgnoreCase(custName)).collect(Collectors.toList());
    }

    public void addOrder(Order orden){
        this.orderList.add(orden);
    }

    public boolean removeOrderById(String Id){
        return this.orderList.removeIf(Orden -> Orden.getId().equals(Id));
    }

    public void service(Order servicio){
        servicio.setCreationTime(LocalDateTime.now());
    }

}

