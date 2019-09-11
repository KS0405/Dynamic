# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tbCompany (
  id                        varchar(255) not null,
  name                      varchar(255),
  address                   varchar(255),
  detail                    varchar(255),
  constraint pk_tbCompany primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table tbCompany;

SET FOREIGN_KEY_CHECKS=1;

