# Chapter 02 _ 02
# 파이썬 완전 기초
# 파이썬 변수

# 기본 선언
n = 700

# 출력
print(n)
print(type(n))
# type : 자료형을 보여줌
# int : 정수형

# 동시 선언
x = y = z = 700
print(x,y,z)

# 선언
var = 75
# 재선언
var = "Change Value"
# 재 선언 가능함 (위에 덮어쓰는 것처럼)

# 출력
print(var)
print(type(var))

# Object Reference
# 변수 값 할당 상태
# 1. 타입에 맞는 오브젝트 생성
# 2. 값을 생성
# 3. 콘솔 출력

# 예1)
print(300)
print(int(300))

# 예2)
# n -> 777
n = 777
print(n, type(n))
print()

m = n
# m -> 777 <- n

print(m, n)
print(type(m), type(n))
print()

m = 400
print(m, n)
print(type(m), type(n))
print()

# id(identity) 확인 : 객체의 고유값 확인
m = 800
n = 655

print(id(m))
print(id(n))
print(id(m) == id(n))
print()

# 같은 오브젝트 참조
m = 800
n = 800

print(id(m))
print(id(n))
print(id(m) == id(n))
print()

# 다양한 변수 선언
# Cemel Case : numberOfCollegeGraduates -> Method
# Pascal Case : NumberOfCollegeGraduates -> 언어를 따지지 않고 주로 Class 선언
# Snake Case : number_of_college_graduates -> 파이썬에서 변수 선언할때 많이 사용함

# 허용하는 변수 선언 법
age = 1
Age = 2
aGe = 3
AGE = 4
a_g_e = 5
_age = 6
age_ = 7
_AGE_ = 8
# 숫자나 특수문자로 시작하면 안됨 언더바와 달러표시만 가능 _ $

print(age)
print(Age)
print(aGe)
print(AGE)
print(a_g_e)
print(_age)
print(age_)
print(_AGE_)

# 예약어는 변수명으로 불가능
"""
False	def	if	raise
None	del	import	return
True	elif	in	try
and	else	is	while
as	except	lambda	with
assert	finally	nonlocal	yield
break	for	not	
class	from	or	
continue	global	pass	
"""
