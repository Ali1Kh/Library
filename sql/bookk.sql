--------------------------------------------------------
--   Table BOOKS
--------------------------------------------------------
 CREATE TABLE BOOKS
   (ID NUMBER PRIMARY KEY, 
	CALLNO VARCHAR2(20 BYTE), 
	NAME VARCHAR2(20 BYTE), 
	AUTHER VARCHAR2(20 BYTE), 
	PUBLISHER VARCHAR2(20 BYTE), 
	QUANTITY NUMBER,
    ADDED_DATE DATE, 
	ISSUED NUMBER
   );

create SEQUENCE seq_book;

--select id,name,auther,publisher,quantity,Issued,to_char(ADDED_DATE,'dd-mm-yyyy') as pub_date from books where id =null;

