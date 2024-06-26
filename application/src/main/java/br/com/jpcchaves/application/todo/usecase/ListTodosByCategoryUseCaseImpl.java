package br.com.jpcchaves.application.todo.usecase;

import br.com.jpcchaves.application.todo.gateway.ListTodosByCategoryGateway;
import br.com.jpcchaves.core.domain.Todo;
import br.com.jpcchaves.usecase.todo.ListTodosByCategoryUseCase;
import java.util.List;

public class ListTodosByCategoryUseCaseImpl implements ListTodosByCategoryUseCase {
  private final ListTodosByCategoryGateway listTodosByCategoryGateway;

  public ListTodosByCategoryUseCaseImpl(ListTodosByCategoryGateway listTodosByCategoryGateway) {
    this.listTodosByCategoryGateway = listTodosByCategoryGateway;
  }

  @Override
  public List<Todo> listByCategory(Long categoryId) {
    return listTodosByCategoryGateway.listByCategory(categoryId);
  }
}
