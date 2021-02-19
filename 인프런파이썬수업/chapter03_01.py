# Chapter 03 _ 01
# # 숫자형

# 파이썬 지원 자료형
"""
int : 정수
float : 실수
complex : 복소수
bool : 불린(true/false)
str : 문자열(시퀀스)
list : 리스트(시퀀스)
tuple : 튜플(시퀀스)
set : 집합
dict : 사전
"""


# 데이터 타입
str1 = "Python"
bool = True
str2 = 'Anaconda'
float = 10.0 # 10 == 10.0 (false)
int = 7
list = [str1, str2]
print(list)
dict = {
    "name" : "jiyoon",
    "age" : 23.0
}
tuple = (7, 8, 9)
tuple = 7, 8, 9 
# tuple은 괄호없이 , 로 해도됨 (그래도 괄호를 쓰는걸 추천)
set = {3, 5, 7}

#데이터 타입 출력
print(type(str1))
print(type(bool))
print(type(str2))
print(type(float))
print(type(int))
print(type(dict))
print(type(tuple))
print(type(set))

# 숫자형 연산자
"""
+
_
*
/
// (몫만)
% (나머지만)
abs(x) (절대값)
pow(x,y) (x의 y제곱) ==  x ** y
"""

# 정수 선언
i = 77
i2 = -14
big_int = 7777777777777777777777999999999999999999999

# 정수 출력
print(i)
print(i2)
print(big_int)

# 실수 선언과 출력
f = 0.9999
f2 = 3.141592
f3 = -3.9
f4 = 3/9

print(f)
print(f2)
print(f3)
print(f4)
print()


# 연산 실습
i1 = 39
i2 = 939
big_int1 = 77777777771231234134355625456
big_int2 = 22345657654564576875654235465768
f1 = 1.234
f2 = 3.939

# +
print(">>> + ")
print("i1 + i2 = ", i1 + i2)
print("f1 + f2 = ", f1 + f2)
print("big_int1 + big_int2 = ", big_int1 + big_int2)


# *
print(">>> * ")
print("i1 * i2 = ", i1 * i2)
print("f1 * f2 = ", f1 * f2)
print("big_int1 * big_int2 = ", big_int1 * big_int2)