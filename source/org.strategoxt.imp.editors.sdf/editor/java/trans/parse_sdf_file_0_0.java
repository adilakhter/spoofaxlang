package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parse_sdf_file_0_0 extends Strategy 
{ 
  public static parse_sdf_file_0_0 instance = new parse_sdf_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_sdf_file_0_0");
    Fail75646:
    { 
      IStrategoTerm q_92015 = null;
      IStrategoTerm r_92015 = null;
      q_92015 = term;
      r_92015 = trans.constSDFTbl;
      term = parse_file_2_1.instance.invoke(context, q_92015, strsglr_perror_0_0.instance, strsglr_report_parse_error_0_0.instance, r_92015);
      if(term == null)
        break Fail75646;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}