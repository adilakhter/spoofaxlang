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

@SuppressWarnings("all") public class is_recursive_declaration_0_0 extends Strategy 
{ 
  public static is_recursive_declaration_0_0 instance = new is_recursive_declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_recursive_declaration_0_0");
    Fail21305:
    { 
      IStrategoTerm t_4171 = null;
      TermReference u_4171 = new TermReference();
      TermReference v_4171 = new TermReference();
      t_4171 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail21305;
      IStrategoTerm arg7597 = term.getSubterm(0);
      if(u_4171.value == null)
        u_4171.value = arg7597;
      else
        if(u_4171.value != arg7597 && !u_4171.value.match(arg7597))
          break Fail21305;
      IStrategoList annos666 = arg7597.getAnnotations();
      if(annos666.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos666).isEmpty())
        break Fail21305;
      if(v_4171.value == null)
        v_4171.value = ((IStrategoList)annos666).head();
      else
        if(v_4171.value != ((IStrategoList)annos666).head() && !v_4171.value.match(((IStrategoList)annos666).head()))
          break Fail21305;
      IStrategoTerm arg7598 = ((IStrategoList)annos666).tail();
      if(arg7598.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7598).isEmpty())
        break Fail21305;
      term = t_4171;
      lifted6453 lifted64530 = new lifted6453();
      lifted64530.u_4171 = u_4171;
      lifted64530.v_4171 = v_4171;
      term = oncetd_1_0.instance.invoke(context, term, lifted64530);
      if(term == null)
        break Fail21305;
      term = t_4171;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}