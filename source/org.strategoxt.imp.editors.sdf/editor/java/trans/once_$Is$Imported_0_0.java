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

@SuppressWarnings("all") public class once_$Is$Imported_0_0 extends Strategy 
{ 
  public static once_$Is$Imported_0_0 instance = new once_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsImported_0_0");
    Fail76157:
    { 
      IStrategoTerm x_92083 = null;
      TermReference y_92083 = new TermReference();
      TermReference z_92083 = new TermReference();
      TermReference a_92084 = new TermReference();
      IStrategoTerm b_92084 = null;
      IStrategoTerm c_92084 = null;
      IStrategoTerm e_92084 = null;
      IStrategoTerm g_92084 = null;
      if(z_92083.value == null)
        z_92083.value = term;
      else
        if(z_92083.value != term && !z_92083.value.match(term))
          break Fail76157;
      if(y_92083.value == null)
        y_92083.value = term;
      else
        if(y_92083.value != term && !y_92083.value.match(term))
          break Fail76157;
      e_92084 = term;
      g_92084 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, g_92084, trans.const15450, z_92083.value);
      if(term == null)
        break Fail76157;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail76157;
      x_92083 = term.getSubterm(0);
      c_92084 = term.getSubterm(1);
      b_92084 = term.getSubterm(2);
      term = x_92083;
      lifted21601 lifted216010 = new lifted21601();
      lifted216010.y_92083 = y_92083;
      lifted216010.z_92083 = z_92083;
      lifted216010.a_92084 = a_92084;
      term = split_fetch_1_0.instance.invoke(context, term, lifted216010);
      if(term == null)
        break Fail76157;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail76157;
      term = hashtable_put_0_2.instance.invoke(context, b_92084, c_92084, term);
      if(term == null)
        break Fail76157;
      term = e_92084;
      if(a_92084.value == null)
        break Fail76157;
      term = a_92084.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}