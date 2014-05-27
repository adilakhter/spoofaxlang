package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class parse_stratego__sugar_string_0_0 extends Strategy 
{ 
  public static parse_stratego__sugar_string_0_0 instance = new parse_stratego__sugar_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("parse_stratego__sugar_string_0_0");
    Fail21428:
    { 
      IStrategoTerm j_4197 = null;
      IStrategoTerm k_4197 = null;
      j_4197 = term;
      k_4197 = trans.constStrategoSugarTbl0;
      term = parse_string_1_1.instance.invoke(context, j_4197, strsglr_report_parse_error_0_0.instance, k_4197);
      if(term == null)
        break Fail21428;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}