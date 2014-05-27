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

@SuppressWarnings("all") final class lifted6725 extends Strategy 
{ 
  TermReference p_4725;

  TermReference q_4725;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24215:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail24215;
      IStrategoTerm arg8079 = term.getSubterm(0);
      if(p_4725.value == null)
        p_4725.value = arg8079;
      else
        if(p_4725.value != arg8079 && !p_4725.value.match(arg8079))
          break Fail24215;
      IStrategoList annos697 = arg8079.getAnnotations();
      if(annos697.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos697).isEmpty())
        break Fail24215;
      if(q_4725.value == null)
        q_4725.value = ((IStrategoList)annos697).head();
      else
        if(q_4725.value != ((IStrategoList)annos697).head() && !q_4725.value.match(((IStrategoList)annos697).head()))
          break Fail24215;
      IStrategoTerm arg8080 = ((IStrategoList)annos697).tail();
      if(arg8080.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8080).isEmpty())
        break Fail24215;
      if(true)
        return term;
    }
    return null;
  }
}