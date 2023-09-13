DESC EMP;
DESC DEPT;
DESC EMP;
DESC BONUS;
DESC SALGRADE;
-----------------------------------------------
-- 주석
-- 기본 SELECT(커리문 이름) *(열. *은 전체의미)  FROM(조회) EMP(조회할 이름);
-- 전체 조회
SELECT * FROM EMP;

-- EMP테이블에서 사원번호 이름 조회
SELECT ENAME, SAL FROM EMP;
--사원번호 이름 부서번호
SELECT EMPNO, ENAME, DEPTNO
FROM EMP;
--SQL문 작성시 유의 사항
--SQL은 대소문자를 구분하지 않음    
--SQL문장은 한줄 또는 여러 줄에 입력될 수 있음
--일반적으로 키워드는 대문자로 입력한다
--일반적으로 이름 열이름 등은 소문자로 작성한다
--SQL문의 마지막 절은 ; 으로 끝난다
--사원번호와 부서 번호만 나오도록 EMP 테이블 조회
SELECT EMPNO, DEPTNO FROM EMP;
--별칭 설정하기: AS, 열이름 또는 컬럼 이름을 별칭으로 표시 할 수 있음
SELECT ENAME AS 이름, SAL AS 급여, SAL*12+COMM AS 연봉, COMM AS 성과급 FROM EMP;
--중복제거: DISTINCT, 데이터를 조회할 때 값이 중복되는 행이 여러개 조회되는 경우, 중복된 행을 한개씩만 선택하고자하는 경우 사용
SELECT DISTINCT JOB, DEPTNO FROM EMP;
SELECT DISTINCT JOB, DEPTNO FROM EMP;
--컬럼값을 계산하는 산술연산자 : 더하기, 빼기, 곱하기 ,나누기 가능
SELECT ENAME, SAL, SAL * 12
FROM EMP;
--WHERE 데이터를 조회할 때 사용자가 원하는 조건에 맞는 데이터만 조회하고 싶을 때 사용(행을 제한한다)
--여러 연산자와 함께 사용한다.
SELECT * FROM EMP
WHERE DEPTNO = 10; 
-- 데터 베이스에서 =은 같다라는 의미로 사용된다. DEPTNO가 10인 경우만 출력
SELECT * FROM EMP
WHERE EMPNO = 7369;
-- 급여가 2500 초과인 사람의 사원번호 이름 직무 급여 출력
SELECT EMPNO, ENAME, JOB, SAL 
FROM EMP
WHERE SAL > 2500;
--
SELECT * FROM EMP
WHERE SAL * 12 = 36000;
--성과급이 500초과인 사원 출력
SELECT * FROM EMP
WHERE COMM >500;
--입사일이 81년 01월 01일일 이전인 데이터를 조회하는 명령
--날짜를 비교하는 경우 날짜 형식에 맞춰 비교
SELECT * FROM EMP
WHERE HIREDATE < '81/01/01';
-- 같지 않음을 표현하는 방법은 여러가지가 존재 <> , != , ^= , NOT
SELECT * FROM EMP
WHERE DEPTNO <> 30
WHERE DEPTNO != 30
WHERE DEPTNO ^= 30
WHERE NOT DEPTNO = 30;
--급여가 3000이상이고 부서가 20번인 사원 조회
SELECT SAL, DEPTNO 
FROM EMP
WHERE SAL >= 3000 AND DEPTNO = 20;
--급여가 3000 이상이고 부서가 20번이고 입사일이 82년 1월 1일 이전 입사한 사원
SELECT * FROM EMP
WHERE SAL >= 3000 AND DEPTNO = 20 AND HIREDATE < '82/01/01';
--급여가 3000이상이고 부서가 20번이거나 입사일이 82년 이전
SELECT * FROM EMP
WHERE SAL >= 3000 AND (DEPTNO = 20 OR HIREDATE < '82/01/01');


--급여가 2500 이상이고 직업이 MANAGER
SELECT * 
FROM EMP
WHERE SAL >= 2500 AND JOB = 'MANAGER';
--
SELECT * 
FROM EMP
WHERE SAL <> 3000;


--IN 연산자: 포함되어 있는 조건을 출력
SELECT * FROM EMP
WHERE JOB = 'MANAGER' OR 
JOB = 'SALESMAN' OR
JOB = 'CLERK';

SELECT * FROM EMP
WHERE JOB IN ('MANAGER','SALESMAN','CLERK');

SELECT * FROM EMP
WHERE DEPTNO NOT IN (20, 30);

--BETWEEN A AND B: 일정한 범위를 조회할 때 사용하는 연산자
--급여가 2000 이상 3000 이하인 사원 조회
SELECT * 
FROM EMP
WHERE SAL >=2000 AND SAL <=3000;

SELECT * 
FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;
--WHERE SAL NOT BETWEEN 2000 AND 3000; 해당 범위 제외 NOT을 사용

--사원 번호가 7689 ~ 9702 사이의 사원 조회
SELECT * 
FROM EMP
WHERE EMPNO BETWEEN 7689 AND 9702;

--1980년에 입사하지 않은 사원 조회
SELECT *
FROM EMP
WHERE NOT HIREDATE BETWEEN '1980/01/01' AND '1980/12/31';

-- LIKE, NOT LIKE 연산자: 일부 문자열이 포함되어 있는지 여부를 확인, 주로 검색에서 사용
-- % : 길이와 상관 없이 모든 문자를 의미
-- _ : 문자 1자를 의미
SELECT EMPNO, ENAME 
FROM EMP
WHERE ENAME LIKE '%K%';          -- K앞이나 뒤에 어떠한 문자가 오든지 상관없이 K가 포함되면 출력

SELECT EMPNO, ENAME 
FROM EMP
WHERE ENAME LIKE '_A%';             -- A앞에 한개의 문자만 와야 출력 뒤에 %를 붙였기에 무한한 길이의 문자가 와도 상관없음
--사원이름에 AM이 포함되어 있는 사원 데이터 출력
SELECT EMPNO, ENAME 
FROM EMP
WHERE ENAME LIKE '%AM%';
--사원이름에 AM이 포함되어 있지 않은 사원데이터 출력
SELECT EMPNO, ENAME 
FROM EMP
WHERE ENAME NOT LIKE '%AM%';

-- null: 값이 정해지지 않음. 미확정 또는 알 수 없는 값을 의미. 연산, 할당, 비교 불가(=, IN):안됨
SELECT ENAME, SAL * 12 + COMM AS 연봉 , COMM
FROM EMP;
-- 연산 불가
SELECT * 
FROM EMP
WHERE COMM = NULL;  -- 연산 불가
-- IS NULL 사용. NULL여부 확인
SELECT *
FROM EMP
WHERE COMM IS NULL;

SELECT *
FROM EMP
WHERE COMM IS NOT NULL;

-- MANAGER가 있는 사원만 조회
SELECT *
FROM EMP
WHERE MGR IS NOT NULL;

























