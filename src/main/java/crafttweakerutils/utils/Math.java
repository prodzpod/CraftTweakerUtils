package crafttweakerutils.utils;

import crafttweaker.annotations.*;
import stanhebben.zenscript.annotations.*;

import java.util.Random;


@ZenRegister
@ZenClass("mods.ctutils.utils.Math")
public class Math {

	static void test()
	{
		Random r = null;

	}

	@ZenMethod
	public static double max(double d1, double d2)
	{
		return java.lang.Math.max(d1, d2);
	}

	@ZenMethod
	public static float max(float f1, float f2)
	{
		return java.lang.Math.max(f1, f2);
	}

	@ZenMethod
	public static long max(long l1, long l2)
	{
		return java.lang.Math.max(l1, l2);
	}

	@ZenMethod
	public static int max(int i1, int i2)
	{
		return java.lang.Math.max(i1, i2);
	}

	@ZenMethod
	public static double min(double d1, double d2)
	{
		return java.lang.Math.min(d1, d2);
	}

	@ZenMethod
	public static float min(float f1, float f2)
	{
		return java.lang.Math.min(f1, f2);
	}

	@ZenMethod
	public static long min(long l1, long l2)
	{
		return java.lang.Math.min(l1, l2);
	}

	@ZenMethod
	public static int min(int i1, int i2)
	{
		return java.lang.Math.min(i1, i2);
	}

	@ZenMethod
	public static long floor(double d1)
	{
		return new Double(java.lang.Math.floor(d1)).longValue();
	}

	@ZenMethod
	public static long ceil(double d1)
	{
		return new Double(java.lang.Math.ceil(d1)).longValue();
	}

	@ZenMethod
	public static double abs(double d1)
	{
		return java.lang.Math.abs(d1);
	}

	@ZenMethod
	public static float abs(float f1)
	{
		return java.lang.Math.abs(f1);
	}

	@ZenMethod
	public static long abs(long l1)
	{
		return java.lang.Math.abs(l1);
	}

	@ZenMethod
	public static int abs(int i1)
	{
		return java.lang.Math.abs(i1);
	}

	@ZenMethod
	public static double sin(double d1)
	{
		return java.lang.Math.sin(d1);
	}

	@ZenMethod
	public static double cos(double d1)
	{
		return java.lang.Math.cos(d1);
	}

	@ZenMethod
	public static double tan(double d1)
	{
		return java.lang.Math.tan(d1);
	}

	@ZenMethod
	public static double asin(double d1)
	{
		return java.lang.Math.asin(d1);
	}

	@ZenMethod
	public static double acos(double d1)
	{
		return java.lang.Math.acos(d1);
	}

	@ZenMethod
	public static double atan(double d1)
	{
		return java.lang.Math.atan(d1);
	}

	@ZenMethod
	public static double sinh(double d1)
	{
		return java.lang.Math.sinh(d1);
	}

	@ZenMethod
	public static double cosh(double d1)
	{
		return java.lang.Math.cosh(d1);
	}

	@ZenMethod
	public static double tanh(double d1)
	{
		return java.lang.Math.tanh(d1);
	}

	@ZenMethod
	public static double sqrt(double d1)
	{
		return java.lang.Math.sqrt(d1);
	}

	@ZenMethod
	public static double random()
	{
		return java.lang.Math.random();
	}

	@ZenMethod
	public static int round(float f1)
	{
		return java.lang.Math.round(f1);
	}

	@ZenMethod
	public static long round(double d1)
	{
		return java.lang.Math.round(d1);
	}

	@ZenMethod
	public static double clamp(double value, double min, double max)
	{
		return (value < min) ? min : (value > max) ? max : value;
	}

	@ZenMethod
	public static float clamp(float value, float min, float max)
	{
		return (value < min) ? min : (value > max) ? max : value;
	}

	@ZenMethod
	public static int clamp(int value, int min, int max)
	{
		return (value < min) ? min : (value > max) ? max : value;
	}

	@ZenMethod
	public static long clamp(long value, long min, long max)
	{
		return (value < min) ? min : (value > max) ? max : value;
	}

	@ZenMethod
	public static IRandom getRandom()
	{
		return new RandomWrapper(new Random());
	}

	@ZenMethod
	public static IRandom getRandom(long seed)
	{
		return new RandomWrapper(new Random(seed));
	}
	
	@ZenMethod
	public static double hypot(double d1, double d2) {
		return java.lang.Math.hypot(d1, d2);
	}

	@ZenMethod
	public static float hypot(float d1, float d2) {
		return (float) hypot((double)d1, d2);
	}

	@ZenMethod
	public static double log(double d1, double d2) {
		return java.lang.Math.log(d1) / java.lang.Math.log(d2);
	}

	@ZenMethod
	public static float log(float d1, float d2) {
		return (float) log((double)d1, d2);
	}

	@ZenMethod
	public static double ln(double d) {
		return java.lang.Math.log(d);
	}

	@ZenMethod
	public static float ln(float d) {
		return (float) ln((double)d);
	}

	@ZenMethod
	public static double log10(double d) {
		return java.lang.Math.log10(d);
	}

	@ZenMethod
	public static float log10(float d) {
		return (float) log10((double)d);
	}

	@ZenMethod
	public static double pow(double d1, double d2) {
		return java.lang.Math.pow(d1, d2);
	}

	@ZenMethod
	public static float pow(float d1, float d2) {
		return (float) pow((double)d1, d2);
	}

	@ZenMethod
	public static long pow(long d1, long d2) {
		return (long) pow((double)d1, d2);
	}

	@ZenMethod
	public static int pow(int d1, int d2) {
		return (int) pow((double)d1, d2);
	}

	@ZenMethod
	public static double signum(double d) {
		return java.lang.Math.signum(d);
	}

	@ZenMethod
	public static float signum(float d) {
		return (float) signum((double)d);
	}

	@ZenMethod
	public static long signum(long d) {
		return (long) signum((double)d);
	}

	@ZenMethod
	public static int signum(int d) {
		return (int) signum((double)d);
	}
}
