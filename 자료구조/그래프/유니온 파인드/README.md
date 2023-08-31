### Union & Find  
  

**여러 개의 노드가 존재할 때 두 개의 노드를 선택해서 현재 노드가 서로 같은 그래프에 속하는지 판별하는 알고리즘**
서로소 집합(Disjoint Sets)라고도 부르며 주로 그래프 알고리즘에서 사용된다.
  
> Find : 어떤 원소가 주어졌을 때 해당 원소가 속한 집합을 반환한다.  
	 일반적으로 어떤 원소가 속한 집합을 대표하는 원소를 반환하여 같은 집합임을 판단 
>
> Union : 두 개의 집합을 하나의 집합으로 합친다. 
>
  
  
- 시간 복잡도
O(logN) 평균적으로 트리의 높이만큼 
  
  
<details>
<summary> 구현  </summary>
1. 집합 생성 및 초기화  
**parent[] 배열로 각 노드가 어떤 부모 노드 아래에 있는지 그래프로 만든다**  
```
 	int[] parent = new int[5];
        for (int i = 0; i < 5; i++) {
            parent[i] = i;
        }
```
초기 배열은 자기 자신의 노드 번호를 가진다(노드마다 분리되어있음)  
  
  
2. Find  
**특정 요소가 어느 집합에 속해있는지 찾는다**  
```
	public int find(int x) {
    	    if(x == parent[x]){
	        return x;
	    }
    	    else{
	        return parent[x] = find(parent[x]);
	    }
	}
```
가장 상위 노드 x의 경우 x == parent[x] 관계가 성립한다.  
재귀를 통해 집합의 가장 상위 노드를 찾아 return  
  
  
3. Union
**x와 y가 포함된 집합을 합친다.**  
```
	public void union(int x, int y) {
    	    x = find(x);
    	    y = find(y);
    	    if(x!=y) { //이미 같은 집합이라면 갱신이 필요없음 
    	        if(x < y) {
		    parent[y] = x;
		}
    	        else {
		    parent[x] = y;
		}
    	    }
	}
```
집합의 가장 상위 노드를 통해 같은 집합임을 표현 

4. 두 요소가 같은 집합인지 판단
** 같은 parent[] 값을 갖는지 확인한다 **
```
	public boolean isSameParent(int x, int y) {
	    x = find(x);
	    y = find(y);
	    if(x == y){
		return true;
	    }
	    else{
		return false;
	    }
 	}
```
find를 통해 재귀로 같은 부모를 갖고 있는지 판단  
   
  
<details>
<summary> 예시  </summary>
1. 초기화 
```
 	int[] parent = new int[3];
        for (int i = 1; i < 4; i++) {
            parent[i] = i;
        }
```
![image](https://github.com/hanseul9/algorithm/assets/102939057/84a69ab2-d998-4dfc-83e2-29ab51c0237b)

2. Union
```
	union(2, 3)
	...
	static void union(int x, int y) {
    	    x = find(x);
    	    y = find(y);
    	    if(x!=y) { //이미 같은 집합이라면 갱신이 필요없음 
    	        if(x < y) {
		    parent[y] = x;
		}
    	        else {
		    parent[x] = y;
		}
    	    }
	}
```
먼저 find(2), find(3) -> 각각 2와 3리턴.  
둘은 다른 집합이므로 연결  
두 집합을 연결 -> parent[3] = 2;
![image](https://github.com/hanseul9/algorithm/assets/102939057/338a4f82-caa8-44cd-ab27-b58e2a2860a2)

3. 같은 집합인지 판단하기 
```
	boolean a = isSameParent(1,2);
	boolean b = isSameParent(2,3);
	....
	public boolean isSameParent(int x, int y) {
	    x = find(x);
	    y = find(y);
	    if(x == y){
		return true;
	    }
	    else{
		return false;
	    }
 	}
```
현재 상황은  
parent[1] = 1;  
parent[2] = 2;  
parent[3] = 2;  
이므로 1와 2의 부모가 다름 << a == false
2 와 3 은 같은 부모 << b == true 



</details>

</details>
  
+) 같은 집합 내에서 두 노드를 연결하면 사이클이 생기기 때문에 사이클 생성 유무를 판단하기 위해서 사용되기도 한다
