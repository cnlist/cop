create table AUTHORITIES
(
  USERNAME        varchar (255)     PRIMARY KEY ,
  AUTHORITY VARCHAR(50) not null,
  constraint FK_AUTHORITIES_USERS
  foreign key (USERNAME) references USERS
);
