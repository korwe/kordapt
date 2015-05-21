--
-- Name: service_instance; Type: TABLE; Schema: public; Owner: kordapt; Tablespace:
--

CREATE TABLE service_instance(
    id BIGINT NOT NULL,
    version integer DEFAULT 0 NOT NULL,
    name varchar(100),
    queue_name VARCHAR(100),
    description VARCHAR(100),
    service_id BIGINT NOT NULL,
    created_at timestamp without time zone DEFAULT now() NOT NULL,
    updated_at timestamp without time zone DEFAULT now() NOT NULL
);


ALTER TABLE public.service_instance OWNER TO kordapt;

                                            --
-- Name: service_instance_pkey; Type: CONSTRAINT; Schema: public; Owner: kordapt; Tablespace:
--

ALTER TABLE ONLY service_instance
    ADD CONSTRAINT service_instance_pkey PRIMARY KEY (id);


--
-- Name: service_instance_service_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: kordapt
--

ALTER TABLE ONLY service_instance
    ADD CONSTRAINT service_instance_service_id_fkey FOREIGN KEY (service_id) REFERENCES service(id);

