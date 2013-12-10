--
-- Name: hibernate_sequences; Type: TABLE; Schema: public; Owner: kordapt; Tablespace:
--

CREATE TABLE hibernate_sequences (
    next_val BIGINT NOT NULL,
    sequence_name VARCHAR(50) NOT NULL
);


ALTER TABLE public.hibernate_sequences OWNER TO kordapt;