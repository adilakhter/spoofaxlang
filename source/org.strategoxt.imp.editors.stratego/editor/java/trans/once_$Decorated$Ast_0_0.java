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

@SuppressWarnings("all") public class once_$Decorated$Ast_0_0 extends Strategy 
{ 
  public static once_$Decorated$Ast_0_0 instance = new once_$Decorated$Ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_DecoratedAst_0_0");
    Fail23498:
    { 
      IStrategoTerm x_4848 = null;
      TermReference y_4848 = new TermReference();
      TermReference z_4848 = new TermReference();
      IStrategoTerm a_4849 = null;
      IStrategoTerm b_4849 = null;
      IStrategoTerm d_4849 = null;
      IStrategoTerm e_4849 = null;
      IStrategoTerm g_4849 = null;
      IStrategoTerm h_4849 = null;
      if(y_4848.value == null)
        y_4848.value = term;
      else
        if(y_4848.value != term && !y_4848.value.match(term))
          break Fail23498;
      d_4849 = term;
      g_4849 = term;
      e_4849 = trans.const4565;
      h_4849 = g_4849;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, h_4849, e_4849, trans.constCons2047);
      if(term == null)
        break Fail23498;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23498;
      x_4848 = term.getSubterm(0);
      b_4849 = term.getSubterm(1);
      a_4849 = term.getSubterm(2);
      term = x_4848;
      lifted7008 lifted70080 = new lifted7008();
      lifted70080.y_4848 = y_4848;
      lifted70080.z_4848 = z_4848;
      term = split_fetch_1_0.instance.invoke(context, term, lifted70080);
      if(term == null)
        break Fail23498;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23498;
      term = hashtable_put_0_2.instance.invoke(context, a_4849, b_4849, term);
      if(term == null)
        break Fail23498;
      term = d_4849;
      if(z_4848.value == null)
        break Fail23498;
      term = z_4848.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}