package br.com.jpcchaves.core.domain;

import br.com.jpcchaves.core.domain.enums.TodoStatus;
import br.com.jpcchaves.core.exception.TodoException;
import br.com.jpcchaves.core.exception.enums.ExceptionDefinition;
import java.time.LocalDateTime;
import java.util.Objects;

public class Todo extends Audited {
  private Long id;
  private String todo;
  private TodoStatus status = TodoStatus.NOT_STARTED;
  private Category category;

  public Todo() {}

  public Todo(String todo) {
    this.todo = todo;
  }

  public Todo(Long id, String todo) {
    this.id = id;
    this.todo = todo;
  }

  public Todo(
      Long id,
      String todo,
      LocalDateTime createdAt,
      LocalDateTime updatedAt,
      Long createdBy,
      Long modifiedBy) {
    super(createdAt, updatedAt, createdBy, modifiedBy);
    this.id = id;
    this.todo = todo;
  }

  public Todo(
      LocalDateTime createdAt,
      LocalDateTime updatedAt,
      Long createdBy,
      Long modifiedBy,
      Long id,
      String todo,
      TodoStatus status) {
    super(createdAt, updatedAt, createdBy, modifiedBy);
    this.id = id;
    this.todo = todo;
    this.status = status;
  }

  public Todo(
      LocalDateTime createdAt,
      LocalDateTime updatedAt,
      Long createdBy,
      Long modifiedBy,
      Long id,
      String todo,
      TodoStatus status,
      Category category) {
    super(createdAt, updatedAt, createdBy, modifiedBy);
    this.id = id;
    this.todo = todo;
    this.status = status;
    this.category = category;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTodo() {
    return todo;
  }

  public void setTodo(String todo) {
    if (Objects.isNull(todo) || todo.isBlank() || todo.isEmpty()) {
      throw new TodoException(ExceptionDefinition.TD0001);
    }

    this.todo = todo;
  }

  public TodoStatus getStatus() {
    return status;
  }

  public void setStatus(TodoStatus status) {
    this.status = status;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    if (Objects.isNull(category)) {
      throw new TodoException(ExceptionDefinition.TD0002);
    }

    this.category = category;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Todo todo1 = (Todo) o;

    if (!id.equals(todo1.id)) return false;
    if (!Objects.equals(todo, todo1.todo)) return false;
    return status == todo1.status;
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + (todo != null ? todo.hashCode() : 0);
    result = 31 * result + (status != null ? status.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Todo{"
        + "id="
        + id
        + ", todo='"
        + todo
        + '\''
        + ", status="
        + status
        + ", category="
        + category
        + '}';
  }
}
