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

@SuppressWarnings("all") public class warnings_multiple_declarations_0_0 extends Strategy 
{ 
  public static warnings_multiple_declarations_0_0 instance = new warnings_multiple_declarations_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("warnings_multiple_declarations_0_0");
    Fail22782:
    { 
      TermReference p_4725 = new TermReference();
      TermReference q_4725 = new TermReference();
      IStrategoTerm r_4725 = null;
      IStrategoTerm s_4725 = null;
      IStrategoTerm t_4725 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail22782;
      IStrategoTerm arg8073 = term.getSubterm(0);
      if(arg8073.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)arg8073).getConstructor())
        break Fail22782;
      IStrategoTerm arg8074 = arg8073.getSubterm(0);
      if(p_4725.value == null)
        p_4725.value = arg8074;
      else
        if(p_4725.value != arg8074 && !p_4725.value.match(arg8074))
          break Fail22782;
      IStrategoList annos696 = arg8074.getAnnotations();
      if(annos696.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos696).isEmpty())
        break Fail22782;
      if(q_4725.value == null)
        q_4725.value = ((IStrategoList)annos696).head();
      else
        if(q_4725.value != ((IStrategoList)annos696).head() && !q_4725.value.match(((IStrategoList)annos696).head()))
          break Fail22782;
      IStrategoTerm arg8075 = ((IStrategoList)annos696).tail();
      if(arg8075.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8075).isEmpty())
        break Fail22782;
      r_4725 = term.getSubterm(1);
      term = r_4725;
      lifted6725 lifted67250 = new lifted6725();
      lifted67250.p_4725 = p_4725;
      lifted67250.q_4725 = q_4725;
      term = collect_all_1_0.instance.invoke(context, term, lifted67250);
      if(term == null)
        break Fail22782;
      s_4725 = term;
      Success12159:
      { 
        Fail22783:
        { 
          IStrategoTerm u_4725 = null;
          u_4725 = term;
          term = s_4725;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail22783;
          IStrategoTerm arg8085 = ((IStrategoList)term).tail();
          if(arg8085.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8085).isEmpty())
            break Fail22783;
          term = u_4725;
          { 
            term = map_1_0.instance.invoke(context, s_4725, lifted6726.instance);
            if(term == null)
              break Fail22782;
            t_4725 = term;
            if(true)
              break Success12159;
          }
        }
        term = trans.constNil4;
        t_4725 = trans.constNil4;
      }
      term = t_4725;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}