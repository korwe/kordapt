CREATE TABLE service_provider(
    id BIGINT NOT NULL,
    version integer DEFAULT 0 NOT NULL,
    name varchar(100),
    group_id varchar(50),


    created_at timestamp without time zone DEFAULT now() NOT NULL,
    updated_at timestamp without time zone DEFAULT now() NOT NULL
);

ALTER TABLE public.service_provider OWNER TO kordapt;

--
-- Name: service_provider_pkey; Type: CONSTRAINT; Schema: public; Owner: kordapt; Tablespace:
--

ALTER TABLE ONLY service_provider
    ADD CONSTRAINT service_provider_pkey PRIMARY KEY (id);

ALTER TABLE ONLY service
    ADD COLUMN service_provider_id BIGINT NOT NULL ;


ALTER TABLE ONLY service
ADD CONSTRAINT service_service_provider_id_fkey FOREIGN KEY (service_provider_id) REFERENCES service_provider(id);
