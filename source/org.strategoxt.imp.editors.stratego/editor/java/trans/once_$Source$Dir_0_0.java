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

@SuppressWarnings("all") public class once_$Source$Dir_0_0 extends Strategy 
{ 
  public static once_$Source$Dir_0_0 instance = new once_$Source$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_SourceDir_0_0");
    Fail21996:
    { 
      IStrategoTerm y_4290 = null;
      TermReference z_4290 = new TermReference();
      TermReference a_4291 = new TermReference();
      IStrategoTerm b_4291 = null;
      IStrategoTerm c_4291 = null;
      IStrategoTerm e_4291 = null;
      IStrategoTerm f_4291 = null;
      IStrategoTerm h_4291 = null;
      IStrategoTerm i_4291 = null;
      if(z_4290.value == null)
        z_4290.value = term;
      else
        if(z_4290.value != term && !z_4290.value.match(term))
          break Fail21996;
      e_4291 = term;
      h_4291 = term;
      f_4291 = trans.const4342;
      i_4291 = h_4291;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, i_4291, f_4291, trans.constCons1966);
      if(term == null)
        break Fail21996;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21996;
      y_4290 = term.getSubterm(0);
      c_4291 = term.getSubterm(1);
      b_4291 = term.getSubterm(2);
      term = y_4290;
      lifted6728 lifted67280 = new lifted6728();
      lifted67280.z_4290 = z_4290;
      lifted67280.a_4291 = a_4291;
      term = split_fetch_1_0.instance.invoke(context, term, lifted67280);
      if(term == null)
        break Fail21996;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21996;
      term = hashtable_put_0_2.instance.invoke(context, b_4291, c_4291, term);
      if(term == null)
        break Fail21996;
      term = e_4291;
      if(a_4291.value == null)
        break Fail21996;
      term = a_4291.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}