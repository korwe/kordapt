--
-- Name: service; Type: TABLE; Schema: public; Owner: kordapt; Tablespace:
--

CREATE TABLE service(
    id BIGINT NOT NULL,
    version integer DEFAULT 0 NOT NULL,
    name varchar(100),
    description varchar(1000),
    api_definition_data  BYTEA,
    created_at timestamp without time zone DEFAULT now() NOT NULL,
    updated_at timestamp without time zone DEFAULT now() NOT NULL
);


ALTER TABLE public.service OWNER TO kordapt;

--
-- Name: service_pkey; Type: CONSTRAINT; Schema: public; Owner: kordapt; Tablespace:
--

ALTER TABLE ONLY service
    ADD CONSTRAINT service_pkey PRIMARY KEY (id);