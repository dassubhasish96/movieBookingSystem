package com.subhu.movieBookingSystem.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Booking {

	@Id
	@GeneratedValue
	private int bookingId;

	@Column(nullable = false)
	private LocalDateTime bookingDate;

	@Column(nullable = false)
	private int noOfSeats;

	@ManyToOne
	@JsonManagedReference
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "movie_theatre_id", nullable = false)
	private MovieTheatre movieTheatre;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MovieTheatre getMovieTheatre() {
		return movieTheatre;
	}

	public void setMovieTheatre(MovieTheatre movieTheatre) {
		this.movieTheatre = movieTheatre;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public LocalDateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	@Override
	public String toString() {
		return "Booking{" + "bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", noOfSeats=" + noOfSeats
				+ '}';
	}
}