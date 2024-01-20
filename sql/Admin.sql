--------------------------------------------------------
--  File created - Sunday-September-17-2023   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table ADMIN
--------------------------------------------------------

  CREATE TABLE "HR"."ADMIN" 
   (	"USERNAME" VARCHAR2(25 BYTE), 
	"PASSWORD" VARCHAR2(25 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;

insert into admin values('ali','ali');
commit;

select * from admin;