--
-- PostgreSQL database dump
--

-- Dumped from database version 15.3
-- Dumped by pg_dump version 15.3

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: adminpack; Type: EXTENSION; Schema: -; Owner: -
--

CREATE EXTENSION IF NOT EXISTS adminpack WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION adminpack; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION adminpack IS 'administrative functions for PostgreSQL';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: personal_account; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.personal_account (
    id bigint NOT NULL,
    balance numeric(38,2) NOT NULL,
    status character varying(255)
);


ALTER TABLE public.personal_account OWNER TO postgres;

--
-- Name: personal_account_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.personal_account_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.personal_account_id_seq OWNER TO postgres;

--
-- Name: personal_account_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.personal_account_id_seq OWNED BY public.personal_account.id;


--
-- Name: personal_account_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.personal_account_seq
    START WITH 1
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.personal_account_seq OWNER TO postgres;

--
-- Name: personal_account id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.personal_account ALTER COLUMN id SET DEFAULT nextval('public.personal_account_id_seq'::regclass);


--
-- Data for Name: personal_account; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.personal_account (id, balance, status) FROM stdin;
2	100.00	-1
1	650.00	1
3	49.80	1
\.


--
-- Name: personal_account_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.personal_account_id_seq', 1, false);


--
-- Name: personal_account_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.personal_account_seq', 1, false);


--
-- Name: personal_account personal_account_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.personal_account
    ADD CONSTRAINT personal_account_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

