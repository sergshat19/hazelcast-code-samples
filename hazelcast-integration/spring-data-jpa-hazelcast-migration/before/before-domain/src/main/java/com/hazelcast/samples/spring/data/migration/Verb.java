package com.hazelcast.samples.spring.data.migration;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

/**
 * <P>A domain object for a verb in our simplistic object model.
 * Although this happens to share many fields with {@link Noun} it
 * doesn't logically extend it, it's a different grammatical
 * concept.
 * </P>
 * <P>Use {@code @Entity} to map this object directly into
 * a table, one-to-one on fields to columns. Watch that the
 * {@link Tense} field is an enumeration so maps in and out
 * to the database as a code digit not a string.
 * </P>
 * <P>Use {@code @Id} to mark which field is the unique
 * identifier.
 * </P>
 * <P>Use {@code @Data} to get Lombok to generate the
 * getters &amp; setters.
 * </P>
 */
@SuppressWarnings("serial")
@Data
@Entity
public class Verb implements Serializable {
	
	@javax.persistence.Id
	@org.springframework.data.annotation.Id
	private int		id;
	
	private String	english;
	private String	french;
	private String	spanish;
	private Tense	tense;

}
