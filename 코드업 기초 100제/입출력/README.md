  
- System.out.println() / System.out.printf()  
println은 줄바꿈 자동  
printf는 포맷 문자열(format string)을 사용하여 출력을 처리해줌.  
format string : 출력할 값의 형식을 지정하고 이를 나타내는 인수를 지정하는 방식  
  
자바에서도 C에서 했던 것처럼 출력할 수 있구나~..  
  
+) format 문자열에서 %0Nd << 해당 정수값이 N자리보다 작으면 앞에 0을 채워넣음  
     
- StringTokenizer  
문자열 분리시 사용하면 좋은 클래스  
1. StringTokenizer st = new StringTokenizer(문자열); << 띄어쓰기를 기준으로 문자열 분리  
2. StringTokenizer st = new StringTokenizer(문자열, 구분자); << 구분자를 기준으로 문자열 분리  
3. StringTokenizer st = new StringTokenizer(문자열, 구분자, true or false); << 구분자를 기준으로 문자열을 분리하고, true/false에 따라 구분자를 토큰에 포함시키거나 포함시키지 않음.(별도의 토큰으로 분류되는 거임) 디폴트는 false
  
그리고 nextToken()으로 꺼내쓰면 됨  
  
  
- split()  
split()는 주어진 정규 표현식 또는 문자열로 String을 분할함. 따라서 "." 을 기준으로 분할할 경우 split("\\\\\.")와 같이 이스케이프 문자를 함께 사용하여 의도하지 않은 결과가 나오는 것을 방지하는 것이 좋음.
    
+) "\\\\\." 에서 역슬래시를 하나가 아닌 두 개를 사용하는 이유  
일단 split는 정확히는 정규 표현식을 기반으로 String을 분할함.  
 . 는 정규표현식에서 특별한 의미를 갖는 meta character이므로 이를 리터럴 문자로 사용하기 위해 . 을 이스케이프 시켜야함.  
근데 \도 메타문자라 \를 이스케이프 시켜줘야함  
하여 결론적으로 \\\\\. 와 같은 형태를 사용하는 것 
  
