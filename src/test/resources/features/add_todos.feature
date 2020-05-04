Feature: Add Todos
  Should be able to add todos to the list

  Scenario: Add an item to the Todo List
    Given Alice was able to start with an empty list
    When Alice attempts to add a todo item called Feed the cat
    Then Alice should see that the todo list has 1 item
    And Alice should see that the todo list contains Feed the cat