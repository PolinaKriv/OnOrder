package by.bsu.dao.impl;

import by.bsu.console.ConsoleInput;
import by.bsu.dao.OrderDAO;
import by.bsu.domain.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class OrderDAOimpl implements OrderDAO {

  @Override
  public Status checkResult(Order order) {
    return order.getOrderStatus();
  }

  @Override
  public void create(Order entity) {}

  @Override
  public Order read(int id) throws IOException {
    return null;
  }

  @Override
  public List<Order> readAll() throws IOException {
    return null;
  }

  @Override
  public void update(Order entity) {}

  @Override
  public void delete(int id) {}
}
