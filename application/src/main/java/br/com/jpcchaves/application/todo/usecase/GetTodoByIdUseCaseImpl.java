package br.com.jpcchaves.application.todo.usecase;

import br.com.jpcchaves.application.todo.gateway.GetTodoGateway;
import br.com.jpcchaves.core.domain.Todo;
import br.com.jpcchaves.usecase.todo.GetTodoByIdUseCase;

public class GetTodoByIdUseCaseImpl implements GetTodoByIdUseCase {
  private final GetTodoGateway getTodoGateway;

  public GetTodoByIdUseCaseImpl(GetTodoGateway getTodoGateway) {
    this.getTodoGateway = getTodoGateway;
  }

  @Override
  public Todo getById(Long id) {
    return getTodoGateway.getTodo(id);
  }
}
