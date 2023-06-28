## 이분 탐색  
O(logn)  
  
> 이분 탐색은 이진 탐색, Binary Search 라고도 한다.
> 
> 순차적 탐색보다 빠른 탐색을 위해 나온 탐색 방법으로 실제로 이분 탐색의 시간복잡도가 순차적 탐색보다 낮다.
>
  
**🔎구현 방법**
재귀함수 또는 반복문으로 구현 가능  
먼저 수들을 정렬하고 아래 그림처럼 시작  
![image](https://github.com/hanseul9/algorithm/assets/102939057/1a910a56-0dff-4fd9-acba-7838ff8fa9ac)  
1. mid와 찾는 요소가 같다면 탐색 종료  
2. "mid < 찾는 요소" 일때는 left를 mid+1 로 하여 탐색 재시작  
3. "mid > 찾는 요소" 일때는 right를 mid-1 로 하여 탐색 재시작  
4. 만약 " left > right" 가 된다면 찾는 요소가 배열에 없는 것  
  
