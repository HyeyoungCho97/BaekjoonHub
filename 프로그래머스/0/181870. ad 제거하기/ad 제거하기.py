def solution(strArr):
    
    subString = "ad"
    
    # find(substring, start, end) -> 부분문자열에서 substring을 찾고 처음 발견된 위치 반환
    # 찾지 못할 경우 -1 반환
    answer = [ s for s in strArr if s.find(subString)==-1]
    
    return answer