DESC EMP;
DESC DEPT;
DESC EMP;
DESC BONUS;
DESC SALGRADE;
-----------------------------------------------
-- �ּ�
-- �⺻ SELECT(Ŀ���� �̸�) *(��. *�� ��ü�ǹ�)  FROM(��ȸ) EMP(��ȸ�� �̸�);
-- ��ü ��ȸ
SELECT * FROM EMP;

-- EMP���̺��� �����ȣ �̸� ��ȸ
SELECT ENAME, SAL FROM EMP;
--�����ȣ �̸� �μ���ȣ
SELECT EMPNO, ENAME, DEPTNO
FROM EMP;
--SQL�� �ۼ��� ���� ����
--SQL�� ��ҹ��ڸ� �������� ����    
--SQL������ ���� �Ǵ� ���� �ٿ� �Էµ� �� ����
--�Ϲ������� Ű����� �빮�ڷ� �Է��Ѵ�
--�Ϲ������� �̸� ���̸� ���� �ҹ��ڷ� �ۼ��Ѵ�
--SQL���� ������ ���� ; ���� ������
--�����ȣ�� �μ� ��ȣ�� �������� EMP ���̺� ��ȸ
SELECT EMPNO, DEPTNO FROM EMP;
--��Ī �����ϱ�: AS, ���̸� �Ǵ� �÷� �̸��� ��Ī���� ǥ�� �� �� ����
SELECT ENAME AS �̸�, SAL AS �޿�, SAL*12+COMM AS ����, COMM AS ������ FROM EMP;
--�ߺ�����: DISTINCT, �����͸� ��ȸ�� �� ���� �ߺ��Ǵ� ���� ������ ��ȸ�Ǵ� ���, �ߺ��� ���� �Ѱ����� �����ϰ����ϴ� ��� ���
SELECT DISTINCT JOB, DEPTNO FROM EMP;
SELECT DISTINCT JOB, DEPTNO FROM EMP;
--�÷����� ����ϴ� ��������� : ���ϱ�, ����, ���ϱ� ,������ ����
SELECT ENAME, SAL, SAL * 12
FROM EMP;
--WHERE �����͸� ��ȸ�� �� ����ڰ� ���ϴ� ���ǿ� �´� �����͸� ��ȸ�ϰ� ���� �� ���(���� �����Ѵ�)
--���� �����ڿ� �Բ� ����Ѵ�.
SELECT * FROM EMP
WHERE DEPTNO = 10; 
-- ���� ���̽����� =�� ���ٶ�� �ǹ̷� ���ȴ�. DEPTNO�� 10�� ��츸 ���
SELECT * FROM EMP
WHERE EMPNO = 7369;
-- �޿��� 2500 �ʰ��� ����� �����ȣ �̸� ���� �޿� ���
SELECT EMPNO, ENAME, JOB, SAL 
FROM EMP
WHERE SAL > 2500;
--
SELECT * FROM EMP
WHERE SAL * 12 = 36000;
--�������� 500�ʰ��� ��� ���
SELECT * FROM EMP
WHERE COMM >500;
--�Ի����� 81�� 01�� 01���� ������ �����͸� ��ȸ�ϴ� ���
--��¥�� ���ϴ� ��� ��¥ ���Ŀ� ���� ��
SELECT * FROM EMP
WHERE HIREDATE < '81/01/01';
-- ���� ������ ǥ���ϴ� ����� ���������� ���� <> , != , ^= , NOT
SELECT * FROM EMP
WHERE DEPTNO <> 30
WHERE DEPTNO != 30
WHERE DEPTNO ^= 30
WHERE NOT DEPTNO = 30;
--�޿��� 3000�̻��̰� �μ��� 20���� ��� ��ȸ
SELECT SAL, DEPTNO 
FROM EMP
WHERE SAL >= 3000 AND DEPTNO = 20;
--�޿��� 3000 �̻��̰� �μ��� 20���̰� �Ի����� 82�� 1�� 1�� ���� �Ի��� ���
SELECT * FROM EMP
WHERE SAL >= 3000 AND DEPTNO = 20 AND HIREDATE < '82/01/01';
--�޿��� 3000�̻��̰� �μ��� 20���̰ų� �Ի����� 82�� ����
SELECT * FROM EMP
WHERE SAL >= 3000 AND (DEPTNO = 20 OR HIREDATE < '82/01/01');


--�޿��� 2500 �̻��̰� ������ MANAGER
SELECT * 
FROM EMP
WHERE SAL >= 2500 AND JOB = 'MANAGER';
--
SELECT * 
FROM EMP
WHERE SAL <> 3000;


--IN ������: ���ԵǾ� �ִ� ������ ���
SELECT * FROM EMP
WHERE JOB = 'MANAGER' OR 
JOB = 'SALESMAN' OR
JOB = 'CLERK';

SELECT * FROM EMP
WHERE JOB IN ('MANAGER','SALESMAN','CLERK');

SELECT * FROM EMP
WHERE DEPTNO NOT IN (20, 30);

--BETWEEN A AND B: ������ ������ ��ȸ�� �� ����ϴ� ������
--�޿��� 2000 �̻� 3000 ������ ��� ��ȸ
SELECT * 
FROM EMP
WHERE SAL >=2000 AND SAL <=3000;

SELECT * 
FROM EMP
WHERE SAL BETWEEN 2000 AND 3000;
--WHERE SAL NOT BETWEEN 2000 AND 3000; �ش� ���� ���� NOT�� ���

--��� ��ȣ�� 7689 ~ 9702 ������ ��� ��ȸ
SELECT * 
FROM EMP
WHERE EMPNO BETWEEN 7689 AND 9702;

--1980�⿡ �Ի����� ���� ��� ��ȸ
SELECT *
FROM EMP
WHERE NOT HIREDATE BETWEEN '1980/01/01' AND '1980/12/31';

-- LIKE, NOT LIKE ������: �Ϻ� ���ڿ��� ���ԵǾ� �ִ��� ���θ� Ȯ��, �ַ� �˻����� ���
-- % : ���̿� ��� ���� ��� ���ڸ� �ǹ�
-- _ : ���� 1�ڸ� �ǹ�
SELECT EMPNO, ENAME 
FROM EMP
WHERE ENAME LIKE '%K%';          -- K���̳� �ڿ� ��� ���ڰ� ������ ������� K�� ���ԵǸ� ���

SELECT EMPNO, ENAME 
FROM EMP
WHERE ENAME LIKE '_A%';             -- A�տ� �Ѱ��� ���ڸ� �;� ��� �ڿ� %�� �ٿ��⿡ ������ ������ ���ڰ� �͵� �������
--����̸��� AM�� ���ԵǾ� �ִ� ��� ������ ���
SELECT EMPNO, ENAME 
FROM EMP
WHERE ENAME LIKE '%AM%';
--����̸��� AM�� ���ԵǾ� ���� ���� ��������� ���
SELECT EMPNO, ENAME 
FROM EMP
WHERE ENAME NOT LIKE '%AM%';

-- null: ���� �������� ����. ��Ȯ�� �Ǵ� �� �� ���� ���� �ǹ�. ����, �Ҵ�, �� �Ұ�(=, IN):�ȵ�
SELECT ENAME, SAL * 12 + COMM AS ���� , COMM
FROM EMP;
-- ���� �Ұ�
SELECT * 
FROM EMP
WHERE COMM = NULL;  -- ���� �Ұ�
-- IS NULL ���. NULL���� Ȯ��
SELECT *
FROM EMP
WHERE COMM IS NULL;

SELECT *
FROM EMP
WHERE COMM IS NOT NULL;

-- MANAGER�� �ִ� ����� ��ȸ
SELECT *
FROM EMP
WHERE MGR IS NOT NULL;

























