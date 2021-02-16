# Chapter 02 _ 01
# 파이썬 완전 기초
# print 사용법

# 기본 출력
print('Python Start!')
print()
print("Python Start!")
print()
print('''Python Start!''')
print("""Python Start!""")

print()

# seperator 옵션
print('P','Y','T','H','O','N' , sep='')
print('010','7777','1234', sep="-")
print('python','google.com',sep="@")

print()


# end 옵션
print('Welcone to', end='     ')
print('IT News', end='  ')
print('Web Site')
print()


# file 옵션
import sys 
print('Learn Python', file=sys.stdout)
print()


# format 옵션(d : 3, s : 'python' , f : 3.141592)
print('%s %s' % ('one', 'two'))
print('{} {}' .format('one', 2 ))
print('{1} {0}' .format('one', 'two'))

print()

# %s
# 왼쪽 공백
print('%10s' % ('nice')) #%10s : 총 자릿수
print('{:>10}'.format('nice'))

# 오른쪽 공백
print('%-10s' % ('nice')) 
print('{:10}'.format('nice'))

print('{:_>10}'.format('nice'))

# 중앙 정렬
print('{:^10}'.format('nice'))

print('%.5s' % ('nice'))
print('%.5s' % ('pythonstudy'))
# % 뒤에 . 이 있으면 지정한 자리만큼 슬라이싱
print('%5s' % ('pythonstudy'))

print('{:10.5}'.format('pythonstudy'))
# 10개의 자리를 확보하지만 5개만 출력(슬라이싱)
print()


# %d
print('%d %d' % (1,2))
print('{} {}'.format(1,2))

print('%4d' % (42))
print('{:4d}'.format(42))
print()


# %f
print('%f' % (3.1415926535))
print('{:f}'.format(3.1415926535))

print('%06.2f' % (3.141592653589793))
print('{:06.2f}'.format(3.141592653589793))
print()