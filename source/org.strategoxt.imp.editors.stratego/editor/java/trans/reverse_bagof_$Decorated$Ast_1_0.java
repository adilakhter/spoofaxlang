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

@SuppressWarnings("all") public class reverse_bagof_$Decorated$Ast_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Decorated$Ast_1_0 instance = new reverse_bagof_$Decorated$Ast_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4849)
  { 
    context.push("reverse_bagof_DecoratedAst_1_0");
    Fail23499:
    { 
      TermReference i_4849 = new TermReference();
      if(i_4849.value == null)
        i_4849.value = term;
      else
        if(i_4849.value != term && !i_4849.value.match(term))
          break Fail23499;
      Success12606:
      { 
        Fail23500:
        { 
          IStrategoTerm m_4849 = null;
          IStrategoTerm o_4849 = null;
          IStrategoTerm p_4849 = null;
          o_4849 = term;
          m_4849 = trans.const4565;
          p_4849 = o_4849;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4849, m_4849, trans.constCons2047);
          if(term == null)
            break Fail23500;
          if(true)
            break Success12606;
        }
        term = trans.constNil4;
      }
      lifted7009 lifted70090 = new lifted7009();
      lifted70090.i_4849 = i_4849;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted70090, k_4849);
      if(term == null)
        break Fail23499;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}