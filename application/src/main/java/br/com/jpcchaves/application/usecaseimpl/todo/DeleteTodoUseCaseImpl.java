package br.com.jpcchaves.application.usecaseimpl.todo;

import br.com.jpcchaves.application.gateway.todo.DeleteTodoGateway;
import br.com.jpcchaves.usecase.todo.DeleteTodoUseCase;

public class DeleteTodoUseCaseImpl implements DeleteTodoUseCase {
  private final DeleteTodoGateway deleteTodoGateway;

  public DeleteTodoUseCaseImpl(DeleteTodoGateway deleteTodoGateway) {
    this.deleteTodoGateway = deleteTodoGateway;
  }

  @Override
  public void delete(Long id) {
    deleteTodoGateway.delete(id);
  }
}