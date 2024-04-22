package br.com.jpcchaves.infrastructure.config;

import br.com.jpcchaves.application.usecaseimpl.*;
import br.com.jpcchaves.infrastructure.gatewayimpl.*;
import br.com.jpcchaves.usecase.todo.CreateTodoUseCase;
import br.com.jpcchaves.usecase.todo.DeleteTodoUseCase;
import br.com.jpcchaves.usecase.todo.GetTodoByIdUseCase;
import br.com.jpcchaves.usecase.todo.ListTodoUseCase;
import br.com.jpcchaves.usecase.todo.UpdateTodoStatusUseCase;
import br.com.jpcchaves.usecase.todo.UpdateTodoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoGatewayConfig {
  @Bean
  public CreateTodoUseCase createTodo(CreateTodoGatewayImpl createTodoGatewayImpl) {
    return new CreateTodoUseCaseImpl(createTodoGatewayImpl);
  }

  @Bean
  public ListTodoUseCase listTodo(ListTodoGatewayImpl listTodoGatewayImpl) {
    return new ListTodoUseCaseImpl(listTodoGatewayImpl);
  }

  @Bean
  public GetTodoByIdUseCase getTodoById(GetTodoByIdGatewayImpl getTodoByIdGatewayImpl) {
    return new GetTodoByIdUseCaseImpl(getTodoByIdGatewayImpl);
  }

  @Bean
  public DeleteTodoUseCase delete(DeleteTodoGatewayImpl deleteTodoGatewayImpl) {
    return new DeleteTodoUseCaseImpl(deleteTodoGatewayImpl);
  }

  @Bean
  UpdateTodoUseCase update(UpdateTodoGatewayImpl updateTodoGatewayImpl) {
    return new UpdateTodoUseCaseImpl(updateTodoGatewayImpl);
  }

  @Bean
  UpdateTodoStatusUseCase updateStatus(UpdateTodoStatusGatewayImpl updateTodoStatusGatewayImpl) {
    return new UpdateTodoStatusUseCaseImpl(updateTodoStatusGatewayImpl);
  }
}
