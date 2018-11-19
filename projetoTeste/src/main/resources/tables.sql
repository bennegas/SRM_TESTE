
CREATE TABLE tb_cliente (
    id_cliente             NUMBER(10) NOT NULL,
    nm_cliente             VARCHAR2(30),
    vl_limit_cred          NUMBER(7, 2),
    tb_tp_risco_tp_risco   VARCHAR2(1) NOT NULL
);

ALTER TABLE tb_cliente ADD CONSTRAINT tb_cliente_pk PRIMARY KEY ( id_cliente );

CREATE TABLE tb_tp_risco (
    tp_risco   VARCHAR2(1) NOT NULL,
    vl_juros   NUMBER(3, 2)
);

ALTER TABLE tb_tp_risco ADD CONSTRAINT tb_tp_risco_pk PRIMARY KEY ( tp_risco );

ALTER TABLE tb_cliente
    ADD CONSTRAINT tb_cliente_tb_tp_risco_fk FOREIGN KEY ( tb_tp_risco_tp_risco )
        REFERENCES tb_tp_risco ( tp_risco );

ALTER TABLE tb_cliente
    ADD CONSTRAINT tb_cliente_tb_tp_risco_fk FOREIGN KEY ( tb_tp_risco_tp_risco )
        REFERENCES tb_tp_risco ( tp_risco );

CREATE SEQUENCE cliente_sequence
 START WITH     1
 INCREMENT BY   1
 NOCACHE
 NOCYCLE;