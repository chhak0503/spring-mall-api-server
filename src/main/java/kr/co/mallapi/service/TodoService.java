package kr.co.mallapi.service;


import kr.co.mallapi.dto.PageRequestDTO;
import kr.co.mallapi.dto.PageResponseDTO;
import kr.co.mallapi.dto.TodoDTO;

public interface TodoService {

    Long register(TodoDTO todoDTO);

    TodoDTO get(Long tno);

    void modify(TodoDTO todoDTO);

    void remove(Long tno);

    PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO);

}
