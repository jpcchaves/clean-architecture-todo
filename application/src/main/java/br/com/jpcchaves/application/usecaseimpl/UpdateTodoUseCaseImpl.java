package br.com.jpcchaves.application.usecaseimpl;

import br.com.jpcchaves.application.gateway.UpdateTodoGateway;
import br.com.jpcchaves.core.domain.Todo;
import br.com.jpcchaves.usecase.UpdateTodoUseCase;

public class UpdateTodoUseCaseImpl implements UpdateTodoUseCase {
  private final UpdateTodoGateway updateTodoGateway;

  public UpdateTodoUseCaseImpl(UpdateTodoGateway updateTodoGateway) {
    this.updateTodoGateway = updateTodoGateway;
  }

  @Override
  public Todo update(Long id, Todo todo) {
    return updateTodoGateway.update(id, todo);
  }
}
