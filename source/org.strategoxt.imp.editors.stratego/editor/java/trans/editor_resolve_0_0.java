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
    Fail23343:
    { 
      IStrategoTerm term12683 = term;
      Success12553:
      { 
        Fail23344:
        { 
          IStrategoTerm f_4825 = null;
          IStrategoTerm g_4825 = null;
          IStrategoTerm h_4825 = null;
          IStrategoTerm i_4825 = null;
          IStrategoTerm j_4825 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
            break Fail23344;
          g_4825 = term.getSubterm(1);
          f_4825 = term.getSubterm(2);
          j_4825 = term;
          term = desugar_position_1_1.instance.invoke(context, g_4825, basic_desugar_0_0.instance, f_4825);
          if(term == null)
            break Fail23344;
          h_4825 = term;
          term = j_4825;
          IStrategoTerm term12684 = term;
          Success12554:
          { 
            Fail23345:
            { 
              IStrategoTerm t_5054 = null;
              IStrategoTerm x_5054 = null;
              TermReference v_5054 = new TermReference();
              IStrategoTerm w_5054 = null;
              term = $Decorated$Ast_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23345;
              x_5054 = term;
              t_5054 = h_4825;
              term = x_5054;
              w_5054 = term;
              lifted6962 lifted69620 = new lifted6962();
              lifted69620.v_5054 = v_5054;
              term = at_position_1_1.instance.invoke(context, term, lifted69620, t_5054);
              if(term == null)
                break Fail23345;
              term = w_5054;
              if(v_5054.value == null)
                break Fail23345;
              term = declaration_of_0_0.instance.invoke(context, v_5054.value);
              if(term == null)
                break Fail23345;
              i_4825 = term;
              if(true)
                break Success12554;
            }
            term = term12684;
            term = $Decorated$Ast_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23344;
            term = parent_at_position_0_1.instance.invoke(context, term, h_4825);
            if(term == null)
              break Fail23344;
            term = declaration_of_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23344;
            i_4825 = term;
          }
          term = i_4825;
          if(true)
            break Success12553;
        }
        term = term12683;
        IStrategoTerm z_4824 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
          break Fail23343;
        IStrategoTerm arg8354 = term.getSubterm(0);
        if(arg8354.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)arg8354).getConstructor())
          break Fail23343;
        z_4824 = arg8354.getSubterm(0);
        term = resolve_import_decl_0_0.instance.invoke(context, z_4824);
        if(term == null)
          break Fail23343;
        term = parse_stratego_file_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail23343;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}