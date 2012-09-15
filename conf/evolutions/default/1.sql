# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table manager (
  id                        bigint not null,
  login                     varchar(255),
  password                  varchar(255),
  constraint pk_manager primary key (id))
;

create sequence manager_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists manager;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists manager_seq;

