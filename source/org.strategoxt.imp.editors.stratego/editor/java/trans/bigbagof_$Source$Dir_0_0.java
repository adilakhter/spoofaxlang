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

@SuppressWarnings("all") public class bigbagof_$Source$Dir_0_0 extends Strategy 
{ 
  public static bigbagof_$Source$Dir_0_0 instance = new bigbagof_$Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_SourceDir_0_0");
    Fail21994:
    { 
      TermReference r_4290 = new TermReference();
      if(r_4290.value == null)
        r_4290.value = term;
      else
        if(r_4290.value != term && !r_4290.value.match(term))
          break Fail21994;
      Success11889:
      { 
        Fail21995:
        { 
          IStrategoTerm u_4290 = null;
          IStrategoTerm w_4290 = null;
          IStrategoTerm x_4290 = null;
          w_4290 = term;
          u_4290 = trans.const4342;
          x_4290 = w_4290;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, x_4290, u_4290, trans.constCons1966);
          if(term == null)
            break Fail21995;
          if(true)
            break Success11889;
        }
        term = trans.constNil3;
      }
      lifted6727 lifted67270 = new lifted6727();
      lifted67270.r_4290 = r_4290;
      term = filter_1_0.instance.invoke(context, term, lifted67270);
      if(term == null)
        break Fail21994;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}