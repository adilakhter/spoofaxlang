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

@SuppressWarnings("all") public class $Decorated$Ast_0_0 extends Strategy 
{ 
  public static $Decorated$Ast_0_0 instance = new $Decorated$Ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("DecoratedAst_0_0");
    Fail23503:
    { 
      TermReference x_4849 = new TermReference();
      IStrategoTerm a_4850 = null;
      IStrategoTerm c_4850 = null;
      IStrategoTerm d_4850 = null;
      if(x_4849.value == null)
        x_4849.value = term;
      else
        if(x_4849.value != term && !x_4849.value.match(term))
          break Fail23503;
      c_4850 = term;
      a_4850 = trans.const4565;
      d_4850 = c_4850;
      term = dr_lookup_rule_0_2.instance.invoke(context, d_4850, a_4850, trans.constCons2047);
      if(term == null)
        break Fail23503;
      lifted7011 lifted70110 = new lifted7011();
      lifted70110.x_4849 = x_4849;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted70110);
      if(term == null)
        break Fail23503;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}