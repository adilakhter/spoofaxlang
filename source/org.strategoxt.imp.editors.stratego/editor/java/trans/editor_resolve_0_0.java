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

@SuppressWarnings("all") public class editor_resolve_0_0 extends Strategy 
{ 
  public static editor_resolve_0_0 instance = new editor_resolve_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("editor_resolve_0_0");
    Fail21867:
    { 
      IStrategoTerm term11974 = term;
      Success11844:
      { 
        Fail21868:
        { 
          IStrategoTerm n_4271 = null;
          IStrategoTerm o_4271 = null;
          IStrategoTerm p_4271 = null;
          IStrategoTerm q_4271 = null;
          IStrategoTerm r_4271 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
            break Fail21868;
          o_4271 = term.getSubterm(1);
          n_4271 = term.getSubterm(2);
          r_4271 = term;
          term = desugar_position_1_1.instance.invoke(context, o_4271, basic_desugar_0_0.instance, n_4271);
          if(term == null)
            break Fail21868;
          p_4271 = term;
          term = r_4271;
          IStrategoTerm term11975 = term;
          Success11845:
          { 
            Fail21869:
            { 
              IStrategoTerm b_4501 = null;
              IStrategoTerm f_4501 = null;
              TermReference d_4501 = new TermReference();
              IStrategoTerm e_4501 = null;
              term = $Decorated$Ast_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21869;
              f_4501 = term;
              b_4501 = p_4271;
              term = f_4501;
              e_4501 = term;
              lifted6691 lifted66910 = new lifted6691();
              lifted66910.d_4501 = d_4501;
              term = at_position_1_1.instance.invoke(context, term, lifted66910, b_4501);
              if(term == null)
                break Fail21869;
              term = e_4501;
              if(d_4501.value == null)
                break Fail21869;
              term = declaration_of_0_0.instance.invoke(context, d_4501.value);
              if(term == null)
                break Fail21869;
              q_4271 = term;
              if(true)
                break Success11845;
            }
            term = term11975;
            term = $Decorated$Ast_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21868;
            term = parent_at_position_0_1.instance.invoke(context, term, p_4271);
            if(term == null)
              break Fail21868;
            term = declaration_of_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21868;
            q_4271 = term;
          }
          term = q_4271;
          if(true)
            break Success11844;
        }
        term = term11974;
        IStrategoTerm h_4271 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
          break Fail21867;
        IStrategoTerm arg7887 = term.getSubterm(0);
        if(arg7887.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)arg7887).getConstructor())
          break Fail21867;
        h_4271 = arg7887.getSubterm(0);
        term = resolve_import_decl_0_0.instance.invoke(context, h_4271);
        if(term == null)
          break Fail21867;
        term = parse_stratego_file_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21867;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}