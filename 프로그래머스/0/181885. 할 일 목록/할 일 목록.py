def solution(todo_list, finished):
    answer = [ value for idx, value in enumerate(todo_list) if not finished[idx] ]
    return answer