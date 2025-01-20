def solution(num_list):
    #num_list.sort() -> 정렬 
    #sorted(num_list) -> 새로운 정렬된 리스트 반환
    num = 5;
    answer = sorted(num_list)[:num]
    return answer