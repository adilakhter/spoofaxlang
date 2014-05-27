package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
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
    Fail23021:
    { 
      IStrategoTerm a_4645 = null;
      TermReference b_4645 = new TermReference();
      TermReference c_4645 = new TermReference();
      TermReference d_4645 = new TermReference();
      IStrategoTerm e_4645 = null;
      IStrategoTerm f_4645 = null;
      IStrategoTerm h_4645 = null;
      IStrategoTerm j_4645 = null;
      if(c_4645.value == null)
        c_4645.value = term;
      else
        if(c_4645.value != term && !c_4645.value.match(term))
          break Fail23021;
      if(b_4645.value == null)
        b_4645.value = term;
      else
        if(b_4645.value != term && !b_4645.value.match(term))
          break Fail23021;
      h_4645 = term;
      j_4645 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, j_4645, trans.const4487, c_4645.value);
      if(term == null)
        break Fail23021;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23021;
      a_4645 = term.getSubterm(0);
      f_4645 = term.getSubterm(1);
      e_4645 = term.getSubterm(2);
      term = a_4645;
      lifted6908 lifted69080 = new lifted6908();
      lifted69080.b_4645 = b_4645;
      lifted69080.c_4645 = c_4645;
      lifted69080.d_4645 = d_4645;
      term = split_fetch_1_0.instance.invoke(context, term, lifted69080);
      if(term == null)
        break Fail23021;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23021;
      term = hashtable_put_0_2.instance.invoke(context, e_4645, f_4645, term);
      if(term == null)
        break Fail23021;
      term = h_4645;
      if(d_4645.value == null)
        break Fail23021;
      term = d_4645.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}