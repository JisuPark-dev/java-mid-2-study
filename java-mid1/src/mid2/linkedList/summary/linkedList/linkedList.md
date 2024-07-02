# linkedList

## ArrayList의 단점

- 배열의 남는 공간이 낭비가 된다.
- 중간이나 처음 공간에 데이터 추가, 삭제 시 자원이 많이 든다.

## 노드와 연결 








## 정리
### ArrayList:

- 빠른 인덱스 접근: 배열 기반이기 때문에 인덱스로 접근하는 속도가 빠릅니다.
- 뒷 부분에 데이터 추가 시 유용.
- 사용 사례: 요소의 빈번한 검색이 필요하거나, 뒷쪽 데이터 추가 삭제가 빈번한 경우
### LinkedList:

- 느린 인덱스 접근: 연결 리스트 기반이기 때문에 인덱스로 접근하는 속도가 느립니다.
- 앞 쪽 인덱스의 빠른 삽입 및 삭제: 앞쪽 노드를 추가하거나 삭제할 때 포인터를 조정하면 되므로 상대적으로 빠릅니다.
- 사용 사례: 앞쪽 데이터 추가 삭제가 빈번한 경우. 

이중 연결 리스트를 사용하면 더욱 성능을 향상시킬 수 있다. 이중 연결리스트는 마지막 노드를 참조하는 변수를 가지고 있어서,
데이터를 뒤에서 부터 삭제 추가하는 경우에도 O(1)의 성능을 제공한다. 


//
보통은 리스트를 만들고, for문을 돌면서 해당 리스트의 뒷쪽에다가 조건이 맞으면 .add하는 식으로만 사용하니깐 거의 대부분 ArrayList를 사용하는 것 같다.
