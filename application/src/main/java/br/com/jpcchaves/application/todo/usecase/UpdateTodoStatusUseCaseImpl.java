package br.com.jpcchaves.application.todo.usecase;

import br.com.jpcchaves.application.todo.gateway.UpdateTodoStatusGateway;
import br.com.jpcchaves.core.domain.enums.TodoStatus;
import br.com.jpcchaves.usecase.todo.UpdateTodoStatusUseCase;

public class UpdateTodoStatusUseCaseImpl implements UpdateTodoStatusUseCase {
  private final UpdateTodoStatusGateway updateTodoStatusGateway;

  public UpdateTodoStatusUseCaseImpl(UpdateTodoStatusGateway updateTodoStatusGateway) {
    this.updateTodoStatusGateway = updateTodoStatusGateway;
  }

  @Override
  public void updateStatus(Long id, TodoStatus status) {
    updateTodoStatusGateway.updateStatus(id, status);
  }
}
